package com.example.ParcijalniJavaWEB3.dto;


    import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


    @NoArgsConstructor
    public class UpisDTO {
        private Long polaznikId;
        private Long programObrazovanjaId;

        public Long getPolaznikId() {
            return polaznikId;
        }

        public void setPolaznikId(Long polaznikId) {
            this.polaznikId = polaznikId;
        }

        public Long getProgramObrazovanjaId() {
            return programObrazovanjaId;
        }

        public void setProgramObrazovanjaId(Long programObrazovanjaId) {
            this.programObrazovanjaId = programObrazovanjaId;
        }
    }

