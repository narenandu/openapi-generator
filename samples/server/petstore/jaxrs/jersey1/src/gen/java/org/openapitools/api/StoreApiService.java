package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.util.Map;
import org.openapitools.model.Order;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class StoreApiService {
      public abstract Response deleteOrder(String orderId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getInventory(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getOrderById( @Min(1L) @Max(5L)Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response placeOrder(Order order,SecurityContext securityContext)
      throws NotFoundException;
}
