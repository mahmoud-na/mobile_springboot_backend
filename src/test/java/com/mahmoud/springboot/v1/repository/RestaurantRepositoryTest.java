package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;


@SpringBootTest
class RestaurantRepositoryTest {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private PackageRepository packageRepository;
    @Autowired
    private SubscriptionRepository subscriptionRepository;


    public RestaurantModel saveRestaurant() {

        BranchModel branch1 = BranchModel.builder()
                .branchPhone("Branch 1")
                .branchLocation("new cairo")
                .build();
        BranchModel branch2 = BranchModel.builder()
                .branchPhone("Branch 2")
                .branchLocation("new giza")
                .build();
        BranchModel branch3 = BranchModel.builder()
                .branchPhone("Branch 3")
                .branchLocation("new october")
                .build();

        NewsModel new1 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new2 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();
        NewsModel new3 = NewsModel.builder()
                .newTittle("5asm 50% 3la el kebda el kelaby ")
                .newDescription("5ooood wa7d kebda taaaaa5od wa7ed tany 3aleeeeh")
                .newImages(List.of("new Image 1 ", "new Image 2 ", "new Image 3 "))
                .newDate(Timestamp.from(Instant.now()))
                .build();


        CategoryModel category = CategoryModel.builder()
                .CategoryName("Akl sory")
                .build();
        CategoryModel category1 = CategoryModel.builder()
                .CategoryName("Akl Masry")
                .build();
        CategoryModel category2 = CategoryModel.builder()
                .CategoryName("Akl italy")
                .build();
        CategoryModel category3 = CategoryModel.builder()
                .CategoryName("Akl saudi")
                .build();

        RestaurantModel restaurant = RestaurantModel.builder()
                .restaurantName("7oda talawth")
                .restaurantClosingTime(Timestamp.from(Instant.now()))
                .restaurantOpeningTime(Timestamp.from(Instant.now()))
                .restaurantHotline("15988")
                .restaurantDescription("Agmed kebda fe masr")
                .restaurantViewers(5000)
                .restaurantLogoImage("kjfhadkhfadkhadkh")
                .branches(List.of(branch1, branch2, branch3))
                .news(List.of(new1, new2, new3))
                .restaurantImages(List.of("Restaurant Image ===> 1", "Restaurant Image ===> 3", "Restaurant Image ===> 3"))
                .restaurantMenuImages(List.of("Restaurant Menu Image ===> 1", "Restaurant Menu Image ===> 3", "Restaurant Menu Image ===> 3"))
                .categories(List.of(category, category1, category2, category3))
                .build();
        restaurantRepository.save(restaurant);
        return restaurant;
    }


    public PackageModel savePackage(){
        PackageModel packageModel = PackageModel.builder()
                .packageName("premium")
                .build();

        packageRepository.save(packageModel);
        return packageModel;
    }

    @Test
    public void restaurantSubscription(){
        Subscription subscription = Subscription.builder()
                .subscriptionStart(Timestamp.from(Instant.now()))
                .subscriptionEnd(Timestamp.from(Instant.now()))
                .restaurant(saveRestaurant())
                .packageModel(savePackage())
                .build();
        subscriptionRepository.save(subscription);
    }

    public void getRestaurant(){
        int x =1;
        long k =1;
        Long obj = k;
        List<RestaurantModel> restaurantModel=  restaurantRepository.findAll();
        System.out.println(restaurantModel);
    }
}