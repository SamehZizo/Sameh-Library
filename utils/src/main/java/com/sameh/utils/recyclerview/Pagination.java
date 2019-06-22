package com.sameh.utils.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Pagination {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Boolean isLoading;
    private Complete complete;

    private int childCount,totalItemCount,position, previewsTotal;

    public Pagination(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager,Complete complete) {
        this.recyclerView = recyclerView;
        this.linearLayoutManager = linearLayoutManager;

        this.isLoading = true;

        this.previewsTotal = 0;

        this.complete = complete;

        setPagination();
    }

    private void setPagination() {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                childCount = recyclerView.getLayoutManager().getChildCount();
                totalItemCount = recyclerView.getLayoutManager().getItemCount();
                position = linearLayoutManager.findFirstVisibleItemPosition();

                if (dy > 0) {
                    if (isLoading) {
                        if (totalItemCount > previewsTotal) {
                            isLoading = false;
                            previewsTotal = totalItemCount;
                        }
                    }
                    else if (totalItemCount - childCount <= position){
                        isLoading = true;
                        complete.onComplete();
                    }
                }
            }
        });
    }

    interface Complete {
        void onComplete();
    }

}
