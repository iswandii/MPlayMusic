package com.ldt.musicr.contract;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
//Teuku Khairul Umam
public abstract class AbsBindAbleHolder<I> extends RecyclerView.ViewHolder {

    public AbsBindAbleHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(I item) {}
}
