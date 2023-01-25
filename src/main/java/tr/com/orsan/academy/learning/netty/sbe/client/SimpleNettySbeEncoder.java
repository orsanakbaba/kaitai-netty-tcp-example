package tr.com.orsan.academy.learning.netty.sbe.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimpleNettySbeEncoder extends MessageToByteEncoder { // (1)

    private static final Logger logger = LogManager.getLogger(SimpleNettySbeEncoder.class);
    private ByteBuf buf;
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        logger.error("Exception :", cause);
        ctx.close();
    }
    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {

    }



}

