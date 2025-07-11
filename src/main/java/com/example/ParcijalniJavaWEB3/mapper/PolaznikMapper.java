package com.example.ParcijalniJavaWEB3.mapper;

import com.example.ParcijalniJavaWEB3.domain.Polaznik;
import com.example.ParcijalniJavaWEB3.dto.PolaznikDTO;

public interface PolaznikMapper {
    public PolaznikDTO mapToPolaznikDto(Polaznik polaznik);
}

