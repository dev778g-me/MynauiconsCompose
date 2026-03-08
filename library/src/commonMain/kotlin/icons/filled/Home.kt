package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Filled.Home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.857f, 4.06f)
                lineToRelative(5.866f, 4.817f)
                curveToRelative(0.33f, 0.27f, 0.527f, 0.686f, 0.527f, 1.13f)
                verticalLineToRelative(8.803f)
                curveToRelative(0f, 0.814f, -0.638f, 1.44f, -1.383f, 1.44f)
                horizontalLineTo(15.25f)
                verticalLineTo(15.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, -2.75f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                verticalLineToRelative(4.75f)
                horizontalLineTo(6.133f)
                curveToRelative(-0.745f, 0f, -1.383f, -0.626f, -1.383f, -1.44f)
                verticalLineToRelative(-8.802f)
                curveToRelative(0f, -0.445f, 0.197f, -0.86f, 0.527f, -1.13f)
                lineToRelative(5.866f, -4.819f)
                arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.714f, 0f)
                moveToRelative(5.01f, 17.69f)
                curveToRelative(1.61f, 0f, 2.883f, -1.335f, 2.883f, -2.94f)
                verticalLineToRelative(-8.802f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.075f, -2.29f)
                lineTo(13.81f, 2.9f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.618f, 0f)
                lineTo(4.325f, 7.718f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.075f, 2.29f)
                verticalLineToRelative(8.802f)
                curveToRelative(0f, 1.605f, 1.273f, 2.94f, 2.883f, 2.94f)
                close()
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null
