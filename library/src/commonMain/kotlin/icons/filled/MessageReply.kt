package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MessageReply: ImageVector
    get() {
        if (_MessageReply != null) {
            return _MessageReply!!
        }
        _MessageReply = ImageVector.Builder(
            name = "Filled.MessageReply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.433f, 2.4f)
                curveToRelative(1.402f, -0.15f, 3.203f, -0.15f, 5.52f, -0.15f)
                horizontalLineToRelative(0.094f)
                curveToRelative(2.317f, 0f, 4.118f, 0f, 5.52f, 0.15f)
                curveToRelative(1.418f, 0.153f, 2.541f, 0.47f, 3.437f, 1.186f)
                curveToRelative(0.92f, 0.736f, 1.35f, 1.693f, 1.553f, 2.9f)
                curveToRelative(0.193f, 1.152f, 0.193f, 2.618f, 0.193f, 4.446f)
                verticalLineToRelative(0.183f)
                curveToRelative(0f, 1.782f, 0f, 3.015f, -0.2f, 3.934f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.545f, 1.323f)
                curveToRelative(-0.264f, 0.392f, -0.6f, 0.722f, -1f, 1.042f)
                curveToRelative(-0.897f, 0.717f, -2.02f, 1.033f, -3.438f, 1.185f)
                curveToRelative(-1.402f, 0.151f, -3.203f, 0.151f, -5.52f, 0.151f)
                horizontalLineTo(12f)
                curveToRelative(-1.056f, 0f, -1.863f, 0.357f, -2.707f, 0.906f)
                curveToRelative(-0.342f, 0.221f, -0.675f, 0.464f, -1.036f, 0.729f)
                lineToRelative(-0.304f, 0.22f)
                curveToRelative(-0.475f, 0.345f, -0.994f, 0.71f, -1.58f, 1.046f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 21f)
                verticalLineToRelative(-2.585f)
                curveToRelative(-0.879f, -0.19f, -1.623f, -0.496f, -2.254f, -1f)
                curveToRelative(-0.4f, -0.321f, -0.737f, -0.65f, -1f, -1.043f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.546f, -1.323f)
                curveToRelative(-0.2f, -0.919f, -0.2f, -2.152f, -0.2f, -3.934f)
                verticalLineToRelative(-0.183f)
                curveToRelative(0f, -1.828f, 0f, -3.294f, 0.193f, -4.445f)
                curveToRelative(0.203f, -1.208f, 0.633f, -2.165f, 1.553f, -2.901f)
                curveToRelative(0.896f, -0.717f, 2.019f, -1.033f, 3.437f, -1.185f)
                moveToRelative(4.5f, 5.117f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.086f, -1.034f)
                lineToRelative(-2.39f, 2.514f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.033f)
                lineToRelative(2.39f, 2.514f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.087f, -1.034f)
                lineToRelative(-1.186f, -1.246f)
                horizontalLineTo(14f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-2.486f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8.764f)
                horizontalLineTo(9.748f)
                close()
            }
        }.build()

        return _MessageReply!!
    }

@Suppress("ObjectPropertyName")
private var _MessageReply: ImageVector? = null
