package com.example.movrank.dto;

import lombok.Data;

@Data
public class BoardDto {
    int rno, bhits;
    String bid, btitle, bcontent, id, bdate, bfile, bsfile;
    //CommonsMultipartFile file1;
}
