package com.example.ParcijalniJavaWEB3.mapper;

import com.example.ParcijalniJavaWEB3.domain.Polaznik;
import com.example.ParcijalniJavaWEB3.dto.PolaznikDTO;
import org.springframework.stereotype.Component;

@Component
public class PolaznikMapperImpl implements PolaznikMapper {

    @Override
    public PolaznikDTO mapToPolaznikDto(Polaznik polaznik) {
        return new PolaznikDTO (
                polaznik.getIme(),
                polaznik.getPrezime(),
               // polaznik.getProgramNaziv()
        );


    }
}
