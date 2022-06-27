package edu.miu.product;

public enum SqlType {
    P_SAVE("INSERT INTO product VALUES ( :productNumber, :name, :price)"),
    P_FINDBYNUMBER("SELECT * FROM product WHERE productNumber =:productNumber"),
    P_FINDBYNAME("SELECT * FROM product WHERE name =:name"),
    P_FINDALL("SELECT * FROM product"),
    P_CLEAR("DELETE from product"),
    P_DELETE("delete from product where productNumber = :productNumber"),
    S_SAVE("INSERT INTO supplier VALUES (:name, :phone, :productNumber)"),
    S_FINDBYNUMBER("SELECT * FROM supplier WHERE productNumber =:productNumber"),
    S_CLEAR("DELETE from supplier"),
    S_DELETE("delete from supplier where productNumber = :productNumber");

        private String value;

    SqlType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
