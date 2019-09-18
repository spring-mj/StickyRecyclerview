package com.mj.sticky.frame.observer.view

import android.content.Context
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.AppCompatImageButton
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.donkingliang.groupedadapter.widget.StickyHeaderLayout

import com.scwang.smartrefresh.layout.SmartRefreshLayout
import android.support.v7.widget.Toolbar
import com.mj.sticky.R

class StickyRecyclerView : RelativeLayout {
    var ct:Context?=null
    var main_refreshLayout: SmartRefreshLayout?=null
    var root_layout: CoordinatorLayout?=null
    var app_bar_layout: AppBarLayout?=null
    var collapsing_toolbar_layout: CollapsingToolbarLayout?=null
    var head_layout:LinearLayout ?=null
    var fl_home_head:FrameLayout?=null
    var iv_main_headPortrait: ImageView?=null
    var tv_main_username: TextView?=null
    var tv_login_out_main:TextView?=null
    var rl_home_float:RelativeLayout?=null
    var rv_gridView:RecyclerView?=null
    var rl_homeType_title:RelativeLayout?=null
    var tv_homeType_title:TextView?=null
    var tv_approval_count:TextView?=null
    var main_toolbar:Toolbar?=null
    var layout_toolbar:RelativeLayout?=null
    var mine_btn_back: AppCompatImageButton?=null
    var mine_tv_title: AppCompatTextView?=null
    var sticky_layout_test: StickyHeaderLayout?=null
    var rv_list_test:RecyclerView?=null
    var ll_holiday_takeup_main:LinearLayout ?=null
    var tv_holiday_footer_main:TextView?=null
    var ll_overTime_takeup_main:LinearLayout?=null
    var tv_overTime_footer:TextView?=null
    var ll_travel_takeup_main:LinearLayout?=null
    var tv_travel_footer:TextView ?=null
//    var iv_home_head:ImageView?=null
//    var tv_office:TextView?=null
    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        init(context)
    }

    private fun init(context: Context) {
        this.ct = context
        val view = LayoutInflater.from(context).inflate(R.layout.view_home_recyclerview, this, true)
        main_refreshLayout=view.findViewById<SmartRefreshLayout>(R.id.main_refreshLayout)
        root_layout=view.findViewById(R.id.root_layout)
        app_bar_layout=view.findViewById(R.id.app_bar_layout)
        collapsing_toolbar_layout=view.findViewById(R.id.collapsing_toolbar_layout)
        head_layout=view.findViewById(R.id.head_layout)
        fl_home_head=view.findViewById(R.id.fl_home_head)
        iv_main_headPortrait=view.findViewById(R.id.iv_main_headPortrait)
        tv_main_username=view.findViewById(R.id.tv_main_username)
        tv_login_out_main=view.findViewById(R.id.tv_login_out_main)
        rl_home_float=view.findViewById(R.id.rl_home_float)
        rv_gridView=view.findViewById(R.id.rv_gridView)
        rl_homeType_title=view.findViewById(R.id.rl_homeType_title)
        tv_homeType_title=view.findViewById(R.id.tv_homeType_title)
        tv_approval_count=view.findViewById(R.id.tv_approval_count)
        main_toolbar=view.findViewById(R.id.main_toolbar)
        layout_toolbar=view.findViewById(R.id.layout_toolbar)
        mine_btn_back=view.findViewById(R.id.mine_btn_back)
        mine_tv_title=view.findViewById(R.id.mine_tv_title)
        sticky_layout_test=view.findViewById(R.id.sticky_layout_test)
        rv_list_test=view.findViewById(R.id.rv_list_test)
        ll_holiday_takeup_main=view.findViewById(R.id.ll_holiday_takeup_main)
        tv_holiday_footer_main=view.findViewById(R.id.tv_holiday_footer_main)
        ll_overTime_takeup_main=view.findViewById(R.id.ll_overTime_takeup_main)
        tv_overTime_footer=view.findViewById(R.id.tv_overTime_footer)
        ll_travel_takeup_main=view.findViewById(R.id.ll_travel_takeup_main)
        tv_travel_footer=view.findViewById(R.id.tv_travel_footer)
//        iv_home_head=view.findViewById(R.id.iv_home_head)
//        tv_office=view.findViewById(R.id.tv_office)
    }
}
