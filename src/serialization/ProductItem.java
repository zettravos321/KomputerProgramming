package serialization;

import java.io.Serializable;

public class ProductItem implements Serializable {

    String nama;
    Double harga;

    public ProductItem(String nama, Double harga) {
        this.nama = nama;
        this.harga = harga;

    }

}
