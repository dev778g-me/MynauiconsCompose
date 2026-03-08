package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CheckCircleOne: ImageVector
    get() {
        if (_CheckCircleOne != null) {
            return _CheckCircleOne!!
        }
        _CheckCircleOne = ImageVector.Builder(
            name = "Filled.CheckCircleOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.449f, 2.399f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.152f, 1.05f)
                lineToRelative(-7.232f, 9.69f)
                arcToRelative(1.537f, 1.537f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.364f, 0.11f)
                lineToRelative(-3.561f, -3.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.112f, -1.006f)
                lineToRelative(3.562f, 3.94f)
                lineToRelative(0.007f, 0.004f)
                quadToRelative(0.006f, 0.003f, 0.02f, 0.003f)
                lineToRelative(0.017f, -0.004f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(7.233f, -9.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -0.153f)
                moveTo(12f, 3.75f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.25f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                curveToRelative(0f, 5.385f, -4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                reflectiveCurveTo(6.615f, 2.25f, 12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
            }
        }.build()

        return _CheckCircleOne!!
    }

@Suppress("ObjectPropertyName")
private var _CheckCircleOne: ImageVector? = null
