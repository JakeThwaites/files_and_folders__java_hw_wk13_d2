package com.codeclan.filesandfolders.FilesAndFolders.repository;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
