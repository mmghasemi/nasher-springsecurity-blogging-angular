package ir.mnm.nasher.dao.blogpost;

import ir.mnm.nasher.dao.Dao;
import ir.mnm.nasher.entity.BlogPost;

import java.util.List;

/**
 * Definition of a Data Access Object that can perform CRUD Operations for {@link BlogPost}s.
 *
 * @author Mohammad Mahdi mohammad.ghasemy@gmail.com
 */
public interface BlogPostDao extends Dao<BlogPost, Long>
{
    List<BlogPost> blogbycateg(int categ);
}
