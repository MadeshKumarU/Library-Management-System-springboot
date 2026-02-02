package com.madesh.books.Controller;

import com.madesh.books.Entity.Lms;
import com.madesh.books.Service.LmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/lms")
public class LmsController {

    @Autowired
    private LmsService lmsService;

    @PostMapping("/add")
    ResponseEntity<Lms> addNewBook(@RequestBody Lms lms)
    {
        return new ResponseEntity<>(lmsService.addNewBook(lms), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<Lms> getBook(@PathVariable Long id)
    {
        try{
            Lms l = lmsService.getBook(id);
            return new ResponseEntity<>(l, HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/showAll")
    ResponseEntity<List<Lms>> getAllBooks()
    {
        return new ResponseEntity<>(lmsService.getAllBooks(), HttpStatus.OK);
    }


    @PutMapping("/update")
    ResponseEntity<Lms> updateBooks(@RequestBody Lms lms)
    {
        return new ResponseEntity<>(lmsService.updateBooks(lms), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteBook(@PathVariable Long id)
    {
        lmsService.deleteBook(id);
    }

}
