package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MessageX: ImageVector
    get() {
        if (_MessageX != null) {
            return _MessageX!!
        }
        _MessageX = ImageVector.Builder(
            name = "Filled.MessageX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.953f, 2.25f)
                curveToRelative(-2.317f, 0f, -4.118f, 0f, -5.52f, 0.15f)
                curveToRelative(-1.418f, 0.153f, -2.541f, 0.47f, -3.437f, 1.186f)
                curveToRelative(-0.92f, 0.736f, -1.35f, 1.693f, -1.553f, 2.9f)
                curveToRelative(-0.193f, 1.152f, -0.193f, 2.618f, -0.193f, 4.446f)
                verticalLineToRelative(0.183f)
                curveToRelative(0f, 1.782f, 0f, 3.015f, 0.2f, 3.934f)
                curveToRelative(0.108f, 0.495f, 0.278f, 0.925f, 0.545f, 1.323f)
                curveToRelative(0.264f, 0.392f, 0.6f, 0.722f, 1.001f, 1.042f)
                curveToRelative(0.631f, 0.505f, 1.375f, 0.81f, 2.254f, 1f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.123f, 0.65f)
                curveToRelative(0.586f, -0.335f, 1.105f, -0.7f, 1.58f, -1.044f)
                lineToRelative(0.304f, -0.221f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.036f, -0.73f)
                curveToRelative(0.844f, -0.548f, 1.65f, -0.905f, 2.707f, -0.905f)
                horizontalLineToRelative(0.047f)
                curveToRelative(2.317f, 0f, 4.118f, 0f, 5.52f, -0.15f)
                curveToRelative(1.418f, -0.153f, 2.541f, -0.47f, 3.437f, -1.186f)
                curveToRelative(0.4f, -0.32f, 0.737f, -0.65f, 1f, -1.042f)
                curveToRelative(0.268f, -0.398f, 0.438f, -0.828f, 0.546f, -1.323f)
                curveToRelative(0.2f, -0.919f, 0.2f, -2.152f, 0.2f, -3.934f)
                verticalLineToRelative(-0.183f)
                curveToRelative(0f, -1.828f, 0f, -3.294f, -0.193f, -4.445f)
                curveToRelative(-0.203f, -1.208f, -0.633f, -2.165f, -1.553f, -2.901f)
                curveToRelative(-0.896f, -0.717f, -2.019f, -1.033f, -3.437f, -1.185f)
                curveToRelative(-1.402f, -0.151f, -3.203f, -0.151f, -5.52f, -0.151f)
                close()
                moveTo(9.47f, 7.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineTo(12f, 9.44f)
                lineToRelative(1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineTo(12f, 11.56f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(1.47f, -1.47f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
        }.build()

        return _MessageX!!
    }

@Suppress("ObjectPropertyName")
private var _MessageX: ImageVector? = null
