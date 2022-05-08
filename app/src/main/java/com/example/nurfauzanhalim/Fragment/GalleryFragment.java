package com.example.nurfauzanhalim.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nurfauzanhalim.Adapter.GalleryAdapter;
import com.example.nurfauzanhalim.Model.GalleryModel;
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
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
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

    // views gallery
    RecyclerView recyclerViewGallery;
    ArrayList<GalleryModel> galleryModel;
    private StaggeredGridLayoutManager manager; // image staggred

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        // gallery
        recyclerViewGallery = root.findViewById(R.id.recview_gallery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL); // image staggred set vertical
        recyclerViewGallery.setLayoutManager(manager);

        galleryModel = new ArrayList<>();

        GalleryModel gallery1 = new GalleryModel(R.drawable.gallery1);
        galleryModel.add(gallery1);
        GalleryModel gallery2 = new GalleryModel(R.drawable.gallery5);
        galleryModel.add(gallery2);
        GalleryModel gallery3 = new GalleryModel(R.drawable.gallery7);
        galleryModel.add(gallery3);
        GalleryModel gallery4 = new GalleryModel(R.drawable.gallery4);
        galleryModel.add(gallery4);
        GalleryModel gallery5 = new GalleryModel(R.drawable.gallery2);
        galleryModel.add(gallery5);
        GalleryModel gallery6 = new GalleryModel(R.drawable.gallery6);
        galleryModel.add(gallery6);
        GalleryModel gallery7 = new GalleryModel(R.drawable.gallery8);
        galleryModel.add(gallery7);
        GalleryModel gallery8 = new GalleryModel(R.drawable.gallery10);
        galleryModel.add(gallery8);
        GalleryModel gallery9 = new GalleryModel(R.drawable.gallery9);
        galleryModel.add(gallery9);
        GalleryModel gallery10 = new GalleryModel(R.drawable.gallery3);
        galleryModel.add(gallery10);

        recyclerViewGallery.setAdapter(new GalleryAdapter(galleryModel));

        return root;
    }
}