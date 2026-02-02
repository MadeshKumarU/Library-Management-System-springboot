package com.madesh.books.Service;

import com.madesh.books.Entity.Lms;
import com.madesh.books.Repository.LmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LmsService {

    @Autowired
    private LmsRepository lmsRepository;

    public Lms addNewBook(Lms lms)
    {
        return lmsRepository.save(lms);
    }

    public Lms getBook(Long id)
    {
        return lmsRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public List<Lms> getAllBooks()
    {
        return lmsRepository.findAll();
    }

    public Lms updateBooks(Lms lms)
    {
        return lmsRepository.save(lms);
    }

    public void deleteBook(Long id)
    {
        lmsRepository.deleteById(id);
    }

}
