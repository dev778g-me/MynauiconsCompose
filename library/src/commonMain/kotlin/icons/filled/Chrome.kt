package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Chrome: ImageVector
    get() {
        if (_Chrome != null) {
            return _Chrome!!
        }
        _Chrome = ImageVector.Builder(
            name = "Filled.Chrome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.11f, 6.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.089f, -0.12f)
                arcTo(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.96f, 5.899f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.146f, -0.067f)
                curveTo(6.009f, 21.116f, 2.25f, 16.997f, 2.25f, 12f)
                curveToRelative(0f, -2.142f, 0.69f, -4.122f, 1.86f, -5.73f)
                moveToRelative(0.616f, 1.833f)
                arcToRelative(8.252f, 8.252f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.87f, 12.028f)
                lineToRelative(2.226f, -3.858f)
                quadToRelative(-0.4f, 0.076f, -0.822f, 0.077f)
                arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.858f, -2.338f)
                close()
                moveTo(5.66f, 6.721f)
                lineTo(7.888f, 10.576f)
                arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.65f)
                horizontalLineToRelative(7.011f)
                arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.75f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.34f, 2.97f)
                moveToRelative(14.084f, 2.43f)
                horizontalLineToRelative(-4.458f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.35f, 12f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.675f, 2.328f)
                lineToRelative(-3.413f, 5.918f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.744f, 9.15f)
            }
        }.build()

        return _Chrome!!
    }

@Suppress("ObjectPropertyName")
private var _Chrome: ImageVector? = null
