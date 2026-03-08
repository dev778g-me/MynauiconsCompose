package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Yen: ImageVector
    get() {
        if (_Yen != null) {
            return _Yen!!
        }
        _Yen = ImageVector.Builder(
            name = "Filled.Yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.568f, 2.887f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.045f, 0.18f)
                lineTo(12f, 10.7f)
                lineToRelative(5.387f, -7.632f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.226f, 0.865f)
                lineToRelative(-5.165f, 7.318f)
                horizontalLineToRelative(4.007f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(12.75f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(4.705f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(12.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(17f)
                horizontalLineTo(6.546f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(4.704f)
                verticalLineToRelative(-2.75f)
                horizontalLineTo(6.546f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(4.007f)
                lineTo(5.387f, 3.932f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -1.045f)
            }
        }.build()

        return _Yen!!
    }

@Suppress("ObjectPropertyName")
private var _Yen: ImageVector? = null
