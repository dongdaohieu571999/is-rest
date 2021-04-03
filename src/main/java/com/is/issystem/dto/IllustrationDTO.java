package com.is.issystem.dto;
import com.is.issystem.entities.IllustrationMainInterest;
import com.is.issystem.entities.IllustrationSubInterest;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class IllustrationDTO {
    Integer id;
    Integer id_customer_info;
    Date create_time;
    String interest_name;
    Integer payment_period_id;
    Integer total_fee;


    IllustrationMainInterest illustrationMainInterest;
    List<IllustrationSubInterest> illustrationSubInterestList;
}
