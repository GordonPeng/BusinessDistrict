package com.risenb.business.ui.PersonalInformation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.risenb.business.R;

/**
 * Created by admin on 2016/7/22.
 * Tany
 * 总排行榜(Fragment)
 */
public class UniversalLeaderboardFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.universal_leaderboard_fragment, container, false);
        return view;
    }
}
