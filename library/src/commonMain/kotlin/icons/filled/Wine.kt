package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Wine: ImageVector
    get() {
        if (_Wine != null) {
            return _Wine!!
        }
        _Wine = ImageVector.Builder(
            name = "Filled.Wine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.75f, 2.25f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(5.75f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.25f, 15f)
                verticalLineToRelative(5.25f)
                horizontalLineTo(8.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(7.2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.85f)
                verticalLineTo(15f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.75f, -5.75f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
            }
        }.build()

        return _Wine!!
    }

@Suppress("ObjectPropertyName")
private var _Wine: ImageVector? = null
