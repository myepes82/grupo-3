package com.digital.booking.port.output;

import com.digital.booking.application.domain.Category;
import org.springframework.data.domain.Page;

public interface CategoryRepository {
    default Category save(Category category){throw new UnsupportedOperationException();}
    default Page<Category> getPaginatedCategories(){throw new UnsupportedOperationException();}
    default Category patch(Category category){throw new UnsupportedOperationException();}
}
