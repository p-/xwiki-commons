/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.websocket;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.xwiki.stability.Unstable;

/**
 * Base class for partial string message handlers.
 * 
 * @version $Id$
 * @since 13.10.5
 * @since 14.3RC1
 */
@Unstable
public abstract class AbstractPartialStringMessageHandler extends AbstractPartialMessageHandler<String>
{
    @Override
    public void onMessage(List<String> parts)
    {
        onMessage(StringUtils.join(parts, ""));
    }

    /**
     * Called to handle the string message when all its parts have been received.
     * 
     * @param message the complete string message
     */
    public abstract void onMessage(String message);
}
