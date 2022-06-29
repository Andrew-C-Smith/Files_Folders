package com.example.Files_and_Folders;

import com.example.Files_and_Folders.Repositories.FileRepository;
import com.example.Files_and_Folders.Repositories.FolderRepository;
import com.example.Files_and_Folders.Repositories.PersonsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	private FileRepository filesRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private PersonsRepository personsRepository;

	@Test
	void contextLoads() {
	}



}
