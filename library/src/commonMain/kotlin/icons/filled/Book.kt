package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Filled.Book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.17f, 2.25f)
                horizontalLineToRelative(9.23f)
                curveToRelative(0.667f, 0f, 1.336f, 0.109f, 1.803f, 0.593f)
                curveToRelative(0.46f, 0.478f, 0.547f, 1.14f, 0.547f, 1.757f)
                verticalLineToRelative(11.8f)
                curveToRelative(0f, 0.543f, -0.072f, 1.077f, -0.35f, 1.509f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.65f, 0.583f)
                verticalLineToRelative(0.908f)
                curveToRelative(0f, 0.666f, -0.108f, 1.335f, -0.591f, 1.802f)
                curveToRelative(-0.478f, 0.462f, -1.14f, 0.548f, -1.757f, 0.548f)
                horizontalLineTo(5.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                verticalLineTo(6.017f)
                curveToRelative(-0.003f, -0.498f, -0.006f, -1.12f, 0.13f, -1.687f)
                curveToRelative(0.167f, -0.692f, 0.552f, -1.363f, 1.371f, -1.78f)
                curveToRelative(0.338f, -0.172f, 0.694f, -0.24f, 1.074f, -0.27f)
                curveToRelative(0.365f, -0.03f, 0.81f, -0.03f, 1.345f, -0.03f)
                moveToRelative(-2.42f, 18f)
                horizontalLineToRelative(10.652f)
                curveToRelative(0.547f, 0f, 0.683f, -0.096f, 0.714f, -0.126f)
                curveToRelative(0.025f, -0.024f, 0.134f, -0.155f, 0.134f, -0.724f)
                verticalLineToRelative(-0.65f)
                horizontalLineToRelative(-10f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
