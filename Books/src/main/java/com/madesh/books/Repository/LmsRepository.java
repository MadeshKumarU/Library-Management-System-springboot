package com.madesh.books.Repository;

import com.madesh.books.Entity.Lms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LmsRepository extends JpaRepository<Lms, Long> {

}
