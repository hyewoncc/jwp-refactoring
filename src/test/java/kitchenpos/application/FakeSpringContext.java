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
import kitchenpos.domain.menu.MenuGroupRepository;
import kitchenpos.domain.menu.MenuRepository;
import kitchenpos.domain.menu.ProductRepository;
import kitchenpos.domain.order.OrderRepository;
import kitchenpos.domain.table.OrderTableRepository;
import kitchenpos.domain.table.TableGroupRepository;

public abstract class FakeSpringContext {

    protected final MenuDao menuDao = new MenuFakeDao();
    protected final MenuGroupDao menuGroupDao = new MenuGroupFakeDao();
    protected final MenuProductDao menuProductDao = new MenuProductFakeDao();
    protected final OrderDao orderDao = new OrderFakeDao();
    protected final OrderLineItemDao orderLineItemDao = new OrderLineItemFakeDao();
    protected final OrderTableDao orderTableDao = new OrderTableFakeDao();
    protected final ProductDao productDao = new ProductFakeDao();
    protected final TableGroupDao tableGroupDao = new TableGroupFakeDao();

    protected final MenuRepository menus = new MenuRepository(menuDao, menuProductDao);
    protected final ProductRepository products = new ProductRepository(productDao);
    protected final MenuGroupRepository menuGroups = new MenuGroupRepository(menuGroupDao);
    protected final OrderTableRepository orderTables = new OrderTableRepository(orderDao, orderTableDao);
    protected final OrderRepository orders = new OrderRepository(orderDao, orderLineItemDao);
    protected final TableGroupRepository tableGroups = new TableGroupRepository(tableGroupDao, orderTableDao, orderDao);
}
