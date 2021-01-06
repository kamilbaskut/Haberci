package tr.daily.all.news.mobilApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import tr.daily.all.news.mobilApp.Models.Article;
// bir article bir image tek bir hbaerin gösterilmesi için
public class ArticleActivity extends AppCompatActivity {

    Article article;
    ImageView img;
    TextView txttitle, txtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //initiate all view
        img = findViewById(R.id.imgFeatureImg);
        txttitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);

        //get article object which we passes from recycler item or slider click.
         article = (Article) getIntent().getSerializableExtra("Article");

         if (article!=null){
             //add all article attribute to view
             Picasso.with(this).load(article.getUrlToImage()).into(img);
             txttitle.setText(article.getTitle());
             txtContent.setText(article.getContent());

         }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
