package org.zerock.guestbook.sample;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Chef {

    @Autowired
    private Chef chef;


}
