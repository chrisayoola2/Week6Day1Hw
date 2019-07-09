package com.example.week6day1hw.view.activities.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.week6day1hw.R;

public class GitRepoActivity extends AppCompatActivity {
private RecyclerView rvRecyclerView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_repo);
        rvRecyclerView = findViewById(R.id.rvRecyclerView);
        GitRepoAsyncTask repositoryAsyncTask = new GitRepoAsyncTask(this);
        repositoryAsyncTask.execute("someString");
    }
}
