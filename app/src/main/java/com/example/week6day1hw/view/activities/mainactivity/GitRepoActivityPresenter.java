package com.example.week6day1hw.view.activities.mainactivity;

import android.content.Context;

import com.example.week6day1hw.model.datasource.local.pojo.GithubUserResponse;
import com.example.week6day1hw.model.datasource.remote.Retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GitRepoActivityPresenter  {

    GitRepoActivityContract gitRepoActivityContract;

    public GitRepoActivityPresenter(GitRepoActivityContract gitRepoActivityContract) {
        this.gitRepoActivityContract = gitRepoActivityContract;
    }

    public void getRepoinfo(Context context) {
        Retrofit retrofitRepo = new Retrofit();
        retrofitRepo.getService().getGitResponse("https://api.github.com/users/chrisayoola2/repos").enqueue(new Callback<GithubUserResponse>() {
            @Override
            public void onResponse(Call<GithubUserResponse> call, Response<GithubUserResponse> response) {
                
            }

            @Override
            public void onFailure(Call<GithubUserResponse> call, Throwable t) {

            }
        });



    }

}
