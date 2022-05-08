package com.example.nurfauzanhalim.Fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.nurfauzanhalim.Adapter.MusicAdapter;
import com.example.nurfauzanhalim.Model.MusicModel;
import com.example.nurfauzanhalim.R;

import java.util.ArrayList;

/*
    Dikerjakan pada tanggal : 7 Mei 2022
    Dibuat oleh :
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicVideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicVideoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicVideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicVideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicVideoFragment newInstance(String param1, String param2) {
        MusicVideoFragment fragment = new MusicVideoFragment();
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

    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<MusicModel> musicModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_music_video, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        musicModel = new ArrayList<>();

        MusicModel music1 = new MusicModel(R.drawable.musicplay, "To The Bone", "Pamungkas");
        musicModel.add(music1);
        MusicModel music2 = new MusicModel(R.drawable.musicplay, "This City", "Sam Fischer");
        musicModel.add(music2);
        MusicModel music3 = new MusicModel(R.drawable.musicplay, "Without Me", "Halsey");
        musicModel.add(music3);
        MusicModel music4 = new MusicModel(R.drawable.musicplay, "Let Me Down Slowly", "Alec Benjamin");
        musicModel.add(music4);
        MusicModel music5 = new MusicModel(R.drawable.musicplay, "Since U Been Gone", "Thomas Daniel");
        musicModel.add(music5);
        MusicModel music6 = new MusicModel(R.drawable.musicplay, "To The Bone", "Pamungkas");
        musicModel.add(music6);
        MusicModel music7 = new MusicModel(R.drawable.musicplay, "This City", "Sam Fischer");
        musicModel.add(music7);
        MusicModel music8 = new MusicModel(R.drawable.musicplay, "Without Me", "Halsey");
        musicModel.add(music8);
        MusicModel music9 = new MusicModel(R.drawable.musicplay, "Let Me Down Slowly", "Alec Benjamin");
        musicModel.add(music9);
        MusicModel music10 = new MusicModel(R.drawable.musicplay, "Since U Been Gone", "Thomas Daniel");
        musicModel.add(music10);

        recyclerViewMusic.setAdapter(new MusicAdapter(musicModel));

        // video
        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.video1;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        return root;
    }
}