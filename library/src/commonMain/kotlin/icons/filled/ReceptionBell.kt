package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ReceptionBell: ImageVector
    get() {
        if (_ReceptionBell != null) {
            return _ReceptionBell!!
        }
        _ReceptionBell = ImageVector.Builder(
            name = "Filled.ReceptionBell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineToRelative(-19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                moveToRelative(-2.111f, -3.214f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineTo(4.61f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-3.215f)
                curveToRelative(0f, -3.362f, 2.688f, -6.107f, 6.028f, -6.107f)
                horizontalLineToRelative(1.361f)
                verticalLineTo(5.25f)
                horizontalLineToRelative(-1.36f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(4.222f)
                lineToRelative(0.076f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.492f)
                lineToRelative(-0.076f, 0.004f)
                horizontalLineTo(12.75f)
                verticalLineToRelative(1.714f)
                horizontalLineToRelative(1.361f)
                curveToRelative(3.34f, 0f, 6.028f, 2.745f, 6.028f, 6.107f)
                close()
            }
        }.build()

        return _ReceptionBell!!
    }

@Suppress("ObjectPropertyName")
private var _ReceptionBell: ImageVector? = null
