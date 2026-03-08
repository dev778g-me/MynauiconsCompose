package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "Outline.Bitcoin",
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
                moveTo(9.273f, 5.25f)
                verticalLineTo(3f)
                moveToRelative(0f, 2.25f)
                horizontalLineTo(8.182f)
                moveToRelative(1.09f, 0f)
                horizontalLineToRelative(4.364f)
                moveToRelative(0f, 0f)
                verticalLineTo(3f)
                moveToRelative(0f, 2.25f)
                curveToRelative(1.808f, 0f, 3.273f, 1.511f, 3.273f, 3.375f)
                reflectiveCurveTo(15.444f, 12f, 13.636f, 12f)
                moveToRelative(-4.363f, 9f)
                verticalLineToRelative(-2.25f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.182f)
                moveToRelative(1.09f, 0f)
                horizontalLineToRelative(4.364f)
                moveToRelative(0f, 2.25f)
                verticalLineToRelative(-2.25f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(1.091f)
                curveToRelative(1.808f, 0f, 3.273f, -1.511f, 3.273f, -3.375f)
                reflectiveCurveTo(16.535f, 12f, 14.727f, 12f)
                horizontalLineToRelative(-1.09f)
                moveTo(6f, 5.25f)
                horizontalLineToRelative(2.182f)
                moveToRelative(0f, 0f)
                verticalLineTo(12f)
                moveToRelative(5.454f, 0f)
                horizontalLineTo(8.182f)
                moveTo(6f, 18.75f)
                horizontalLineToRelative(2.182f)
                moveToRelative(0f, 0f)
                verticalLineTo(12f)
            }
        }.build()

        return _Bitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _Bitcoin: ImageVector? = null
