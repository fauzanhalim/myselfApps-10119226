package com.example.nurfauzanhalim.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nurfauzanhalim.Adapter.DailyAdapter;
import com.example.nurfauzanhalim.Adapter.FriendlistAdapter;
import com.example.nurfauzanhalim.Model.DailyModel;
import com.example.nurfauzanhalim.Model.FriendlistModel;
import com.example.nurfauzanhalim.R;

import java.util.ArrayList;

/*
    Dikerjakan pada tanggal : 6 Mei 2022
    Dibuat oleh :
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // views dailyact
    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    // views friendlist
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        // daliyact
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_banguntidur, "Bangun Pagi", "bangun tidur maks jam 06.00");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_makan, "Sarapan", "makan sayuran sehat");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_olahraga, "Olahraga", "olahraga pagi bentar aja");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_kuliahonline, "Kuliah Online", "megikuti pembelajaran online");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_risetrobotik, "Riset", "belajar dan riset");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_santuy, "Istirahat", "dengar lagu atau nonton santai");
        dailyModel.add(daily6);
        DailyModel daily7 = new DailyModel(R.drawable.daily_banguntidur, "Bangun Pagi", "bangun tidur maks jam 06.00");
        dailyModel.add(daily7);
        DailyModel daily8 = new DailyModel(R.drawable.daily_makan, "Sarapan", "makan sayuran sehat");
        dailyModel.add(daily8);
        DailyModel daily9 = new DailyModel(R.drawable.daily_olahraga, "Olahraga", "olahraga pagi bentar aja");
        dailyModel.add(daily9);
        DailyModel daily10 = new DailyModel(R.drawable.daily_kuliahonline, "Kuliah Online", "megikuti pembelajaran online");
        dailyModel.add(daily10);
        DailyModel daily11 = new DailyModel(R.drawable.daily_risetrobotik, "Riset", "belajar dan riset");
        dailyModel.add(daily11);
        DailyModel daily12 = new DailyModel(R.drawable.daily_santuy, "Istirahat", "dengar lagu atau nonton santai");
        dailyModel.add(daily12);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        // friendlist
        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.friend1, "Aisyah");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.friend2, "Bunga");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.friend3, "Ahsan");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.friend4, "Turangga");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.friend5, "Azizah");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.friend6, "Dinda");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}