package com.example.Files_and_Folders.Repositories;

import com.example.Files_and_Folders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder,Long> {
}
