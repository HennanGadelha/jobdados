package com.jobdados.jobdados.csv;

public class Chamado {

    String ano;
    String bairo;
    String latitude;
    String longitude;

    public Chamado(String ano, String bairo, String latitude, String longitude) {
        this.ano = ano;
        this.bairo = bairo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Chamado{" +
                "ano='" + ano + '\'' +
                ", bairo='" + bairo + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
