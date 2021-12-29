package hello.itemservice.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class UploadItemForm {

    private Long id;
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}
