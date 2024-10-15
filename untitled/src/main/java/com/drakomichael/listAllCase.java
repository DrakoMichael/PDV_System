package com.drakomichael;
import com.drakomichael.models.ItemModel;

import java.util.List;

public class listAllCase {
    public listAllCase(List<ItemModel> items){
        for (ItemModel item: items) {
            item.exibirInformacoes();
        }
    }
}
