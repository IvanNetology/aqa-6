package ru.netology.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationInfo {
    private String city;
    private String name;
    private String phoneNumber;

}
