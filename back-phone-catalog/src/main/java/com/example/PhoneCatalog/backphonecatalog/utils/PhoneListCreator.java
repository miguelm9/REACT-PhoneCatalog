package com.example.PhoneCatalog.backphonecatalog.utils;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;

import java.util.List;

public class PhoneListCreator {

    public List<PhoneDTO> fillListWithPhones () {
        PhoneDTO phoneDTO = new PhoneDTO(0, "iPhone 7", "Apple", "Apple iPhone 7 smartphone. Announced Sep 2016", "red", 229.99,
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.directoffice.co.ke%2Fwp-content%2Fuploads%2Fiphone7plus-.png&f=1&nofb=1",
                "4.7 Inch", "Apple A10 Fusion APL1W24", 2);

        PhoneDTO phoneDTO1 = new PhoneDTO(1, "Meizu M5", "Meizu", "Meizu M5 Android smartphone. Announced Oct 2016.", "cyan", 74.00,
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fc2.lestechnophiles.com%2Fimages.frandroid.com%2Fwp-content%2Fuploads%2F2019%2F04%2Fmeizu-m5.png%3Fresize%3D580%2C580&f=1&nofb=1",
                "5.5 Inch", "A53 1.8GHz 64bit Octa-Core", 3);

        PhoneDTO phoneDTO2 = new PhoneDTO(2, "Samsung Galaxy S5", "Samsung Electronics", "The Samsung Galaxy S5 is an Android-based smartphone unveiled, produced, released and marketed by Samsung Electronics as part of the Samsung Galaxy S series.", "white", 135.40,
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fc1-ebgames.eb-cdn.com.au%2Fmerchandising%2Fimages%2Fpackshots%2F8fad5a1bc52e44db9f93be93d29815da_Large.png&f=1&nofb=1",
                "5.1 Inch", "Qualcomm MSM8974AC Snapdragon 801", 2);

        PhoneDTO phoneDTO3 = new PhoneDTO(3, "Xiaomi Redmi 9", "Xiaomi", "", "tropical green", 154.35,
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftechnospain.es%2F541676-thickbox_default%2Fxiaomi-redmi-9-32gb-verde.jpg&f=1&nofb=1",
                "6.53 Inch", "MediaTek Helio G80", 4);

        PhoneDTO phoneDTO4 = new PhoneDTO(4, "Pine Phone", "PineStore", "This is a PinePhone Community Edition featuring Manjaro mobile Linux operating system. ", "black", 144.50,
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmanjaro.org%2Fimg%2Fhardware%2Fpinephone.png&f=1&nofb=1",
                "5.95 Inch", "Cortex A-53", 2);

        return List.of(phoneDTO, phoneDTO1, phoneDTO2,phoneDTO4, phoneDTO3);
    }
}
