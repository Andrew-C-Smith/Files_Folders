package com.example.Files_and_Folders.Repositories;

import com.example.Files_and_Folders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File,Long> {
}
