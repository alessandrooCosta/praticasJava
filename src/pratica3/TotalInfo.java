package pratica3;

import java.util.List;

public class TotalInfo {
/*
    private String totalInfo;

    public TotalInfo(TituloApi tituloApi) {
        this.totalInfo = tituloApi.totalItems();
    }

    public String getTotalInfo() {
        return totalInfo;
    }

    @Override
    public String toString() {
        return "TotalInfo{" +
                "totalInfo=" + totalInfo +
                '}';
    }*/
    private List items;

    public List getItems() {
        return items;
    }

    public TotalInfo(TituloApi tituloApi) {
        this.items = tituloApi.items();
    }

    @Override
    public String toString() {
        return "TotalInfo{" +
                "items='" + items + '\'' +
                '}';
    }
}
