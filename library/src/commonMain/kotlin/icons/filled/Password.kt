package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Password: ImageVector
    get() {
        if (_Password != null) {
            return _Password!!
        }
        _Password = ImageVector.Builder(
            name = "Filled.Password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.165f, 8.33f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.006f, 0.334f)
                lineTo(12f, 10.323f)
                lineToRelative(0.83f, -1.659f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.34f, 0.671f)
                lineToRelative(-0.957f, 1.915f)
                horizontalLineToRelative(1.037f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.037f)
                lineToRelative(0.958f, 1.915f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.342f, 0.67f)
                lineTo(12f, 13.677f)
                lineToRelative(-0.83f, 1.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.34f, -0.67f)
                lineToRelative(0.957f, -1.915f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.037f)
                lineToRelative(-0.958f, -1.915f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.336f, -1.006f)
                moveToRelative(-6.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.006f, 0.335f)
                lineToRelative(0.829f, 1.658f)
                lineToRelative(0.83f, -1.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, 0.67f)
                lineToRelative(-0.956f, 1.915f)
                horizontalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(6.464f)
                lineToRelative(0.957f, 1.915f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.342f, 0.67f)
                lineToRelative(-0.829f, -1.658f)
                lineToRelative(-0.83f, 1.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.67f)
                lineToRelative(0.956f, -1.915f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.036f)
                lineTo(3.08f, 9.335f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.336f, -1.006f)
                moveToRelative(13.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.006f, 0.335f)
                lineToRelative(0.829f, 1.658f)
                lineToRelative(0.83f, -1.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.34f, 0.67f)
                lineToRelative(-0.957f, 1.915f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.037f)
                lineToRelative(0.958f, 1.915f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.342f, 0.67f)
                lineToRelative(-0.829f, -1.658f)
                lineToRelative(-0.83f, 1.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.67f)
                lineToRelative(0.957f, -1.915f)
                horizontalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.037f)
                lineToRelative(-0.958f, -1.915f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.336f, -1.006f)
            }
        }.build()

        return _Password!!
    }

@Suppress("ObjectPropertyName")
private var _Password: ImageVector? = null
