package com.abmtech.eduriteadmin.apis;

import static com.abmtech.eduriteadmin.apis.BaseUrls.getCourseList;

import com.abmtech.eduriteadmin.models.AboutUsModel;
import com.abmtech.eduriteadmin.models.CourseModel;
import com.abmtech.eduriteadmin.models.FaqModel;
import com.abmtech.eduriteadmin.models.LoginModel;
import com.abmtech.eduriteadmin.models.MaterialListModel;
import com.abmtech.eduriteadmin.models.PrivacyPolicyModel;
import com.abmtech.eduriteadmin.models.ReviewListModel;
import com.abmtech.eduriteadmin.models.SignupModel;
import com.abmtech.eduriteadmin.models.TermsModel;
import com.abmtech.eduriteadmin.models.UserProfileModel;
import com.abmtech.eduriteadmin.models.UsersModel;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {


    @FormUrlEncoded
    @POST(BaseUrls.login)
    Call<LoginModel> loginAdmin(
            @Field("username") String username,
            @Field("password") String password,
            @Field("fcm") String fcm

    );


    @GET(getCourseList)
    Call<CourseModel> getAllCourse();


    @FormUrlEncoded
    @POST(BaseUrls.getUserProfile)
    Call<UserProfileModel> getProfile(
            @Field("user_id") String userId
    );

    //
    @FormUrlEncoded
    @POST(BaseUrls.getUsersRatings)
    Call<ReviewListModel> getReview(
            @Field("user_id") String userId
    );
//
//

    @FormUrlEncoded
    @POST(BaseUrls.updateProfile)
    Call<SignupModel> updateProfile(
            @Field("user_id") String user_id,
            @Field("name") String name,
            @Field("image") String image
    );

    @FormUrlEncoded
    @POST(BaseUrls.addFaq)
    Call<SignupModel> addFaq(
            @Field("faq_type") String faq_type,
            @Field("question") String question,
            @Field("answer") String answer
    );

    @FormUrlEncoded
    @POST(BaseUrls.editAbout)
    Call<SignupModel> addAbout(
            @Field("text") String text
    );

    @FormUrlEncoded
    @POST(BaseUrls.editTermsConditions)
    Call<SignupModel> addTermsConditions(
            @Field("text") String text
    );

    @FormUrlEncoded
    @POST(BaseUrls.editPrivacy)
    Call<SignupModel> addPrivacy(
            @Field("text") String text
    );

    @FormUrlEncoded
    @POST(BaseUrls.deleteCourse)
    Call<SignupModel> deleteCourse(
            @Field("course_id") String course_id
    );

    @FormUrlEncoded
    @POST(BaseUrls.deleteMaterial)
    Call<SignupModel> deleteMaterial(
            @Field("material_id") String course_id
    );


    @POST(BaseUrls.getMaterialList)
    Call<MaterialListModel> getMaterialList();

    //
    @POST(BaseUrls.getAboutUs)
    Call<AboutUsModel> getAboutUs();

    @POST(BaseUrls.getPrivacyPolicy)
    Call<PrivacyPolicyModel> getPrivacyPolicy();

    @POST(BaseUrls.getTerms)
    Call<TermsModel> getTerms();

    @POST(BaseUrls.get_faq)
    Call<FaqModel> getFaq();

    @POST(BaseUrls.getUsersList)
    Call<UsersModel> getUsersList();

}
