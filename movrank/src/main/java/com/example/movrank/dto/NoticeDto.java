package com.example.movrank.dto;

import lombok.Data;

@Data
public class NoticeDto {
    int rno, nhits;
    String nid, ntitle, ncontent, ndate;
}
