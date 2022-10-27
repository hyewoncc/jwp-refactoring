package kitchenpos.application;

import kitchenpos.dao.MenuDao;
import kitchenpos.dao.MenuFakeDao;
import kitchenpos.dao.MenuGroupDao;
import kitchenpos.dao.MenuGroupFakeDao;
import kitchenpos.dao.MenuProductDao;
import kitchenpos.dao.MenuProductFakeDao;
import kitchenpos.dao.OrderDao;
import kitchenpos.dao.OrderFakeDao;
import kitchenpos.dao.OrderLineItemDao;
import kitchenpos.dao.OrderLineItemFakeDao;
import kitchenpos.dao.OrderTableDao;
import kitchenpos.dao.OrderTableFakeDao;
import kitchenpos.dao.ProductDao;
import kitchenpos.dao.ProductFakeDao;
import kitchenpos.dao.TableGroupDao;
import kitchenpos.dao.TableGroupFakeDao;

public abstract class FakeSpringContext {

    protected final MenuDao menuDao = new MenuFakeDao();
    protected final MenuGroupDao menuGroupDao = new MenuGroupFakeDao();
    protected final MenuProductDao menuProductDao = new MenuProductFakeDao();
    protected final OrderDao orderDao = new OrderFakeDao();
    protected final OrderLineItemDao orderLineItemDao = new OrderLineItemFakeDao();
    protected final OrderTableDao orderTableDao = new OrderTableFakeDao();
    protected final ProductDao productDao = new ProductFakeDao();
    protected final TableGroupDao tableGroupDao = new TableGroupFakeDao();
}