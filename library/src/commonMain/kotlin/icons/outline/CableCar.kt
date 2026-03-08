package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CableCar: ImageVector
    get() {
        if (_CableCar != null) {
            return _CableCar!!
        }
        _CableCar = ImageVector.Builder(
            name = "Outline.CableCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(3.5f, 3.5f)
                lineToRelative(10.625f, 1.568f)
                moveToRelative(0f, 0f)
                lineToRelative(6.375f, 0.515f)
                moveToRelative(-6.375f, -0.515f)
                lineTo(12f, 9.875f)
                moveToRelative(-8.5f, 5.313f)
                horizontalLineToRelative(4.25f)
                moveToRelative(12.75f, 0f)
                horizontalLineToRelative(-4.25f)
                moveToRelative(-8.5f, 0f)
                verticalLineTo(20.5f)
                moveToRelative(0f, -5.312f)
                horizontalLineToRelative(8.5f)
                moveToRelative(0f, 0f)
                verticalLineTo(20.5f)
                moveToRelative(-8.5f, 0f)
                horizontalLineTo(6.688f)
                arcTo(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 17.313f)
                verticalLineToRelative(-4.25f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.188f, -3.188f)
                horizontalLineToRelative(10.625f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.187f, 3.188f)
                verticalLineToRelative(4.25f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.187f, 3.187f)
                horizontalLineTo(16.25f)
                moveToRelative(-8.5f, 0f)
                horizontalLineToRelative(8.5f)
            }
        }.build()

        return _CableCar!!
    }

@Suppress("ObjectPropertyName")
private var _CableCar: ImageVector? = null
