package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Baby: ImageVector
    get() {
        if (_Baby != null) {
            return _Baby!!
        }
        _Baby = ImageVector.Builder(
            name = "Filled.Baby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.161f, 2.251f)
                lineToRelative(0.089f, -0.001f)
                quadToRelative(0.048f, 0f, 0.095f, 0.006f)
                curveTo(17.57f, 2.438f, 21.75f, 6.731f, 21.75f, 12f)
                curveToRelative(0f, 5.385f, -4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                reflectiveCurveTo(6.615f, 2.25f, 12f, 2.25f)
                close()
                moveTo(9.46f, 4.15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.791f, 3.337f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, -1.118f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.074f, -2.616f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.717f, 0.397f)
                moveTo(9f, 9.25f)
                curveToRelative(-0.486f, 0f, -0.916f, 0.195f, -1.247f, 0.488f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.994f, 1.124f)
                arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10.75f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.253f, 0.112f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.994f, -1.124f)
                arcTo(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9.25f)
                moveToRelative(6f, 0f)
                curveToRelative(-0.486f, 0f, -0.916f, 0.195f, -1.247f, 0.488f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.994f, 1.124f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.253f, -0.112f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.253f, 0.112f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.994f, -1.124f)
                arcTo(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9.25f)
                moveToRelative(-5.553f, 5.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.894f, 1.204f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16.75f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.447f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.894f, -1.204f)
                arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.25f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.553f, -0.852f)
            }
        }.build()

        return _Baby!!
    }

@Suppress("ObjectPropertyName")
private var _Baby: ImageVector? = null
