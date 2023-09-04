package org.zerock.guestbook.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
//@AllArgsConstructor
@RequiredArgsConstructor //final이 붙은것만 생성자 주입
//@NoArgsConstructor
public class Restaurant {
    private final Chef chef;
    private final Guest guest;
}
