package io.github.javiewer.fragment;

import io.github.javiewer.network.Network;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Author: MagicDroidX
 */
public class ReleasedFragment extends MovieFragment {
    @Override
    public Call<ResponseBody> getCall(int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://avmo.pw")
                .build();

        Network network = retrofit.create(Network.class);

        return network.getReleased(page);
    }
}
